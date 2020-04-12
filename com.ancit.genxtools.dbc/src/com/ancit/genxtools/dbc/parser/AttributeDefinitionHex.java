package com.ancit.genxtools.dbc.parser;

class AttributeDefinitionHex extends AttributeDefinition {
	private final long min;
	private final long max;
	private long def;

	public AttributeDefinitionHex(String name, AttrTarget target, long min, long max)
	{
		super(name, target, AttrType.HEX);
		this.min = min;
		this.max = min;
		def = 0;
	}

	void setDefault(long def)
	{
		this.def = def;
	}
	
	long getDefault()
	{
		return def;
	}

	long getMax()
	{
		return max;
	}
	
	long getMin()
	{
		return min;
	}
}