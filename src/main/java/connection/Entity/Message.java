package connection.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
;

@Entity
public class Message {
    @Id // поле id будет идентификаторм
    @GeneratedValue(strategy= GenerationType.AUTO) // фреймвор сам разобраслся в каком видет индентификаторы будут генерится
    private int id;
     private String text;
       private String tag;
         public Message(){}

         public Message(String text, String tag){
             this.tag = tag;
             this.text = text;
         }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    // public Message()

}