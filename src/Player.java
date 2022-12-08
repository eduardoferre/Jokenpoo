public class Player {
    //Atributos
    private String name;
    private Integer score;

    //Construtor
    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public void incrementScore(){
        setScore(getScore()+1);
    }
    //Get e Set
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore(){
        return score;
    }

}
