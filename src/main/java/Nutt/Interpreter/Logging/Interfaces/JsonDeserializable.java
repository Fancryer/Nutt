package Nutt.Interpreter.Logging.Interfaces;

public interface JsonDeserializable<T>
{
	T deserialize(String json);
}
