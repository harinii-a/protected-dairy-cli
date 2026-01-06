public class DiaryEntry {

    private String date;
    private String content;

    public DiaryEntry(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Date  : " + date + "\nEntry : " + content +
                "\n----------------------";
    }
}
