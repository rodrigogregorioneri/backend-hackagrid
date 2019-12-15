package br.com.neri.hackagrid.integration.nfe;

import br.com.neri.hackagrid.integration.matera.dto.RequestAccount;
import br.com.neri.hackagrid.integration.matera.dto.ResponseAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class AuthenticateFocusNfe {

    @Autowired
    RestTemplate restTemplate;

    public void criaContaFisica(RequestAccount requestAccount){
        String secretKey = "91de6993-9d39-47fa-aa07-be9ccc217f5b";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("Api-Access-Key",secretKey);
        HttpEntity<RequestAccount> entity = new HttpEntity<RequestAccount>(requestAccount,headers);
        restTemplate.exchange(
                "https://gateway.gr1d.io/sandbox/focusnfe/v1/v2/nfe?ref="+secretKey, HttpMethod.POST, entity,String.class ).getBody();
    }
}
