public class NamesHandler {
    private String[] names;

public NamesHandler(String[] names) {
    this.names = names;
}
public NamesHandler(String names) {
    this.names = names.split(",");
}


public String toString() {

    return String.join(", ", names);
}

public String toStringByLength(int sizeOfLength) {
    String srtingOfName = "";
    for (String name : names) {

        if (sizeOfLength == name.length()) {

            srtingOfName = srtingOfName + name + " ";
        }

    }
    return (srtingOfName.length() > 0) ? srtingOfName : "names with the specified number of characters were not found";

}
public String toStringByStartWith(char firstLetterOfName) {
    String srtingOfName = "";
    for (String name : names) {

        if (firstLetterOfName == name.charAt(0)) {

            srtingOfName = srtingOfName + name + " ";
        }
}
    return (srtingOfName.length() > 0) ? srtingOfName : "names with first letter " + firstLetterOfName + " not found";
}
}
