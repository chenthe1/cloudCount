package com.cloudCount.platform.amm.web;

import java.util.HashMap;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;

public class TestJWT01 {
	public static void main(String[] args) {
		final String issuer = "https://mydomain.com/";
		final String secret = "{{a secret used for signing}}";

		final long iat = System.currentTimeMillis() / 1000l; // issued at claim 
		final long exp = iat + 60L; // expires claim. In this case the token expires in 60 seconds

		final JWTSigner signer = new JWTSigner(secret);
		final HashMap<String, Object> claims = new HashMap<String, Object>();
		claims.put("iss", issuer);
		claims.put("exp", exp);
		claims.put("iat", iat);

		final String jwt = signer.sign(claims);
		System.out.println(jwt);
		
	}
	
	

}
