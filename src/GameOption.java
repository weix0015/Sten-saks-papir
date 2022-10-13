public enum GameOption {
    ROCK(1,2),PAPER(2,3),SICSSORS(3,4),EMPTY(-1,-1);
    private  int id;
    public int winBy;

    GameOption(int id,int winBy){
        this.id=id;
        this.winBy=winBy;
    }
    public static GameOption valueof(int userEnterOption){
        for(GameOption option: GameOption.values()){
            if(userEnterOption==option.id){
                return option;
            }
        }
        return EMPTY;
    }
}
