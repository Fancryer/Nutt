//package Nutt.ParseHelpers;
//
//import Nutt.Types.IValuable;
//import com.ibm.icu.impl.Row;
//
//public class RowBuilder
//{
//	private Row row;
//
//	public RowBuilder()
//	{
//		this(new Row("","Valuable"));
//	}
//
//	public RowBuilder(Row initRow)
//	{
//		row=initRow;
//	}
//
//	public RowBuilder setName(String name)
//	{
//		row=row.setName(name);
//		return this;
//	}
//
//	public RowBuilder setPartition(Partition partition)
//	{
//		row=row.setPartition(partition);
//		return this;
//	}
//
//	public Row build()
//	{
//		return row;
//	}
//
//	public RowBuilder setCeilType(String ceilType)
//	{
//		row=row.setCeilType(ceilType);
//		return this;
//	}
//
//	public RowBuilder setValue(IValuable value)
//	{
//		row=row.setValue(value);
//		return this;
//	}
//}