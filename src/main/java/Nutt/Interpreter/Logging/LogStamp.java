package Nutt.Interpreter.Logging;

import Nutt.Interpreter.Logging.Interfaces.JsonDeserializable;
import Nutt.Interpreter.Logging.Interfaces.JsonSerializable;
import lombok.Builder;

import java.time.Instant;

@Builder
public record LogStamp(String timeStamp,String action,String message,EActionStatus status,ESeverity severity,int depth)
		implements JsonSerializable, JsonDeserializable<LogStamp>

{
	@Override public LogStamp deserialize(String json)
	{
		String trimmed=json.replaceAll("\\s+",""),
				timeStamp=getValueFromJson(trimmed,"timeStamp"),
				action=getValueFromJson(trimmed,"action"),
				message=getValueFromJson(trimmed,"message"),
				status=getValueFromJson(trimmed,"status"),
				severity=getValueFromJson(trimmed,"severity"),
				depth=getValueFromJson(trimmed,"depth");
		return builder().timeStamp(timeStamp)
		                .action(action)
		                .message(message)
		                .status(EActionStatus.valueOf(status))
		                .severity(ESeverity.valueOf(severity))
		                .depth(Integer.parseInt(depth))
		                .build();
	}

	private String getValueFromJson(String json,String key)
	{
		int startIndex=json.indexOf("\""+key+"\":")+key.length()+3, endIndex=json.indexOf("\"",startIndex);
		return json.substring(startIndex,endIndex);
	}

	@Override public String serialize()
	{
		var jsonBuilder=new StringBuilder().append("{");
		appendFieldToJson(jsonBuilder,"timeStamp",timeStamp());
		appendFieldToJson(jsonBuilder,"action",action());
		appendFieldToJson(jsonBuilder,"message",message());
		appendFieldToJson(jsonBuilder,"status",status().name());
		appendFieldToJson(jsonBuilder,"severity",severity().name());
		appendFieldToJson(jsonBuilder,"depth",String.valueOf(depth()),false);
		return jsonBuilder.append("}").toString();
	}

	private void appendFieldToJson(StringBuilder jsonBuilder,String key,String value)
	{
		appendFieldToJson(jsonBuilder,key,value,true);
	}

	private void appendFieldToJson(StringBuilder jsonBuilder,String key,String value,boolean addComma)
	{
		jsonBuilder.append("\"").append(key).append("\":\"").append(value).append("\"");
		if(addComma) jsonBuilder.append(",");
	}

	public static class LogStampBuilder
	{
		private String timeStamp=Instant.now().toString();
		private String action="";
		private String message="";
		private EActionStatus status=EActionStatus.Pending;
		private ESeverity severity=ESeverity.Info;
		private int depth=Thread.currentThread().getStackTrace().length;
	}
}
