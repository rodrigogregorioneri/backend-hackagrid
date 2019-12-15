package br.com.neri.hackagrid.integration.matera;


import br.com.neri.hackagrid.integration.matera.dto.RequestAccount;
import br.com.neri.hackagrid.integration.matera.dto.ResponseAccount;
import com.google.common.hash.Hashing;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@RestController
public class AuthenticateMatera {

    @Autowired
    RestTemplate restTemplate;

    public ResponseAccount criaContaFisica(RequestAccount requestAccount){
        String sequencial = "11990111391";
        String corporateTaxId = "73578754000105";
        String valoresHash = sequencial + corporateTaxId;
        String secretKey = "813F6952-D615-4E5C-9547-C31ABED75895";
        String hash = retornaHashs(secretKey,sequencial);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("Api-Access-Key",secretKey);
        headers.set("Transaction-Hash",hash);
        HttpEntity<RequestAccount> entity = new HttpEntity<RequestAccount>(requestAccount,headers);

        return restTemplate.exchange(
                "https://varcom-mp-api-01.matera.com/v1/accounts", HttpMethod.POST, entity, ResponseAccount.class).getBody();
    }




    public String retornaHash(String originalString){
        String sha255hex = Hashing.sha256()
                .hashString(originalString, StandardCharsets.UTF_8)
                .toString();
        return sha255hex;
    }

    public String retornaHashs(String secretKeys,String originalString){
        try {
            String secret = secretKeys ;
            String message = originalString;

            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);

            String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
            System.out.println(hash);
            return hash;
        }
        catch (Exception e){
            System.out.println("Error");
            return null;
        }
    }
}
