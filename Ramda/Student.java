package Ramda;

public class Student {
	private String name;
	private String sex;
	private int score;
	private int englishScore;
	private int mathScore;
	
	public Student(String name,String sex, int score){
		this.name=name;
		this.sex=sex;
		this.score=score;
	}
	
	public Student(String name,int englishScore,int mathScore){
		this.name=name;
		this.englishScore= englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	

}
