package digitalone.aula3.java.programar;

public class Student {
    private String name;
    private double average;

    //construtor inicializa variaveis de instância

    public Student(String name, double average)
    {
        this.name = name;
        //valida que a média é > 0.0 e <= 100.0; caso contrario,
        //armazena o valor padrão da média da variavel de instância (0.0)

        if (average > 0.0)
            if(average <= 100.0)
                this.average = average;


    }


    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }
    public double getAverage()
    {
        return average;

    }
    public String getLetterGrade()
    {
        String letterGrade = "";
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }










}
