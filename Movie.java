/*
 * Movie.java
 */
public class Movie {

  protected String title, rating;
  public int sessionNo;

  public Movie() {
  };

  public Movie(String tle, String rt, int sn) {
    this.title = tle;
    this.rating = rt;
    this.sessionNo = sn;
  };

  public String getSession() {
    if (0 > this.sessionNo || this.sessionNo < 4) {
      return "invalid sessionNo";
    }
    if (this.sessionNo == 1) {
      return "Morning (10am)";
    } else if (this.sessionNo == 2) {
      return "Afternoon (3pm)";
    } else
      return "evening (8pm)";

  };

  public String getTitle() {
    return this.title;
  };

  public void setTitle(String movieName) {
    this.title = movieName;
  };

}
