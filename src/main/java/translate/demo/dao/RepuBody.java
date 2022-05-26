package translate.demo.dao;

import com.alibaba.fastjson.JSONObject;

import java.sql.Array;
import java.util.List;

public class RepuBody {
    String from ;
    String to;
   List<Language> trans_result;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<Language> getTrans_result() {
        return trans_result;
    }

    public void setTrans_result(String trans_result) {
        List<Language> language = JSONObject.parseArray(trans_result, Language.class);
        this.trans_result = language;
    }
}
