class Student extends Person{
	private int[] testScores;
    public Student(String firstName, String lastName, int id, int[]testScores){
        super(firstName,lastName,id);
        this.testScores = new int[testScores.length];
        for(int i=0;i<testScores.length;i++)
            this.testScores[i]=testScores[i];
        
    }
    public char calculate(){
        int total = 0;
        for(int i=0;i<this.testScores.length;i++)
            total+=this.testScores[i];
        total = total/this.testScores.length;
        //System.out.println(total);
        char g='x';
        if(total<40)
            g='T';
        else if(total <55)
            g = 'D';
        else if(total < 70)
            g = 'P';
        else if(total < 80)
            g = 'A';
        else if(total < 90)
            g = 'E';
        else 
            g = 'O';
        return g;
    }

   
}
