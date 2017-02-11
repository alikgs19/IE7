package modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class FinalizeQuery {
    public String Token;

    public FinalizeQuery(String _Token){
        this.Token = _Token;
    }

    public String getToken(){
        return Token;
    }

    public String toString(){

        String finalizequery = "FIN " + Token;
        return finalizequery;
    }
}
