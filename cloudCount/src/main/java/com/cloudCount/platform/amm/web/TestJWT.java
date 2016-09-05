package com.cloudCount.platform.amm.web;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;

public class TestJWT {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}*/
	
	public static void main(String[] args){
		final String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0NzMwNzk0NjQsImlzcyI6Imh0dHBzOi8vbXlkb21haW4uY29tLyIsImlhdCI6MTQ3MzA3OTQwNH0.GeScL7LMZTZpR_sOJcaeZGiJ-EqjJxLBIvRM5zcdGY4";
		/*final String secret = "{{secret used for signing}}";
		try {
		    final JWTVerifier verifier = new JWTVerifier(secret, "{{my-audience}}", "{{my-issuer}}");
		    final Map<String,Object> claims= jwtVerifier.verify(jwt);
		} catch (JWTVerifyException e) {
		    // Invalid Token
		}*/
		
		final String secret = "{{secret used for signing}}";
		try {
		    final JWTVerifier verifier = new JWTVerifier(secret);
		    final Map<String,Object> claims= JWTVerifier.verify(jwt);
		} catch (JWTVerifyException e) {
		    // Invalid Token
		}
		
	}

}
