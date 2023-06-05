package utilities;

public class Manage {

    private String   querySabah="SELECT count(*) FROM heallife_hospitaltraining.appointment WHERE HOUR(time) < 12";
    private String  queryAksam="SELECT count(*) FROM heallife_hospitaltraining.appointment WHERE HOUR(time) > 12";

    public String getQuerySabah() {
        return querySabah;
    }

    public String getQueryAksam() {
        return queryAksam;
    }
}



//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/mustafaOzsamur/cucumberJDBC.git
//git push -u origin main