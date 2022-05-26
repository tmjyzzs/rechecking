package translate.demo.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import translate.demo.dao.Language;
import translate.demo.dao.RepuBody;
import translate.demo.utils.TransApi;

import javax.print.DocFlavor;
import java.sql.Array;
import java.util.List;
@Service
public class Exchange {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20220525001228885";
    private static final String SECURITY_KEY = "wzod5OkfDQKjGVivz9X6";

    public String langeEx(String befStr ,String lang){

        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String one = api.getTransResult(befStr, "auto", lang);
        System.out.println(one);
        RepuBody repuBody = JSONObject.parseObject(one, RepuBody.class);

        List<Language> trans_result = repuBody.getTrans_result();
        Language language = trans_result.get(0);
        String dst = language.getDst();

        System.out.println(dst);

        return dst;
    }

    public String fiveEx(String text){
        String[] five={"en","ru","it","zh"};
        String afterLang = text;


        for (int i = 0; i < five.length; i++) {
            afterLang = langeEx(afterLang, five[i]);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return afterLang;

    }
}
