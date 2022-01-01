package com.design.pattern.creational.builder;
// Java code to demonstrate Builder Pattern

// Server Side Code
final class Student {

	// final instance fields
	private final int id;
	private final String name;
	private final String address;

	public Student(Builder builder)
	{
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
	}

	// Static class Builder
	public static class Builder {

		/// instance fields
		private int id;
		private String name;
		private String address;

		public static Builder newInstance()
		{
			return new Builder();
		}

		private Builder() {}

		// Setter methods
		public Builder setId(int id)
		{
			this.id = id;
			return this;
		}
		public Builder setName(String name)
		{
			this.name = name;
			return this;
		}
		public Builder setAddress(String address)
		{
			this.address = address;
			return this;
		}

		// build method to deal with outer class
		// to return outer instance
		public Student build()
		{
			return new Student(this);
		}
	}

	@Override
	public String toString()
	{
		return "id = " + this.id + ", name = " + this.name +
							", address = " + this.address;
	}
}


// Driver class
public class BuilderDemo {
	public static void main(String args[])
	{
		Student student = Student.Builder.newInstance()
                .setId(1)
                .setName("Ram")
                .setAddress("Noida")
                .build();
		System.out.println(student);
	}
}
