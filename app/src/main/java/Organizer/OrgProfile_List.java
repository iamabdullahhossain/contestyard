package Organizer;

public class OrgProfile_List {
    int id;
    String post_name, post_last_date, post_fees, post_banner;

    public OrgProfile_List(int id, String post_name, String post_last_date, String post_fees, String post_banner) {
        this.id = id;
        this.post_name = post_name;
        this.post_last_date = post_last_date;
        this.post_fees = post_fees;
        this.post_banner = post_banner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_last_date() {
        return post_last_date;
    }

    public void setPost_last_date(String post_last_date) {
        this.post_last_date = post_last_date;
    }

    public String getPost_fees() {
        return post_fees;
    }

    public void setPost_fees(String post_fees) {
        this.post_fees = post_fees;
    }

    public String getPost_banner() {
        return post_banner;
    }

    public void setPost_banner(String post_banner) {
        this.post_banner = post_banner;
    }
}
