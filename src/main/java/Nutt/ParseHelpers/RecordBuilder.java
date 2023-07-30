package Nutt.ParseHelpers;

import Nutt.Types.Functional.Record.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordBuilder
{
	private final Record record;

	public RecordBuilder()
	{
		record=new Record(null);
	}

	public RecordBuilder setName(String name)
	{
		record.setName(name);
		return this;
	}

	public RecordBuilder setRows(List<Row> rows)
	{
		record.setRows(rows);
		return this;
	}

	public RecordBuilder addRow(Row row)
	{
		var rows=new ArrayList<>(record.getRows());
		rows.add(row);
		record.setRows(rows);
		return this;
	}

	public Record build()
	{
		return record;
	}
}