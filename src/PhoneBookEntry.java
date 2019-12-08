public class PhoneBookEntry {

    private String name;
    private int number;

    public PhoneBookEntry(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString (){
        return "Name:\t" + this.name + "\nNumber\t" + this.number + "\n\n";
    }
}
