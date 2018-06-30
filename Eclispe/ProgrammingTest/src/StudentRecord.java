
public class StudentRecord {
		
		private int id;
		private String name;
		private int tutorialNo;
		private double marks;
		
		public StudentRecord()
		{
			this(0, "", 0, 0.0);
		}
		
		public StudentRecord(int sId, String sName, int tutoNo, double mar)
		{
			setId( sId );
			setName( sName );
			setTutorialNo( tutoNo );
			setMarks( mar );
		}

		public void setId(int sId )
		{
			id = sId;
		}
		
		public int getId()
		{
			return id;
		}
		
		public void setName(String sName )
		{
			name = sName;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setTutorialNo(int tutoNo)
		{
			tutorialNo = tutoNo;
		}
		
		public int getTutorialNo()
		{
			return tutorialNo;
		}
		
		public void setMarks( double mar )
		{
			marks = mar;
		}
		
		public double getMarks()
		{
			return marks;
		}
		

}



