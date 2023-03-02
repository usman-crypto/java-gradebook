class GradeBook
{
	String CourseName;
	String InstructorName;
	double ClassNumber;

	void SetCourseName(String CN)
		{
			CourseName=CN;
		}
	String GetCourseName()
		{
			return CourseName;
		}
	
	void SetInstructorName(String IN)
		{
			InstructorName=IN;
		}
	String GetInstructorName()
		{
			return InstructorName;
		}

	void SetClassNumber(double NUM)
		{
			ClassNumber=NUM;
		}
	double GetClassNumber()
		{
			return ClassNumber;
		}
	void DisplayProfile()
	{
		System.out.println(GetCourseName() + "This Course is presented by  " + GetInstructorName() + "and have classnumber is    " + GetClassNumber() );
	
	}

}

		

