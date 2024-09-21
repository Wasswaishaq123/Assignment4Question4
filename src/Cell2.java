public class Cell2 {
    private String lawyer;
    private String prison;

    public Cell2(String lawyer, String prison) {
        this.lawyer = lawyer;
        this.prison=prison;
        System.out.println(lawyer);
        System.out.println(prison);
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    public String getPrison() {
        return prison;
    }

    public void setPrison(String prison) {
        this.prison = prison;
    }
}


