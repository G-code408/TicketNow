/*
 * InternationalMovie.java
 */
public class InternationalMovie extends Movie {
  private String language;
  public InternationalMovie(){};

  public InternationalMovie(String title,String rating,int sessionNo, String language){
    this.title = title;
    this.rating = rating;
    this.sessionNo = sessionNo;
    this.language = language;
  }

  public String getLanguage(){
    return this.language;
  };
}