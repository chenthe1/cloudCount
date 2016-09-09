package com.cloudCount.platform.utilTest.jwt;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;
import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;

public class TestJWT {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String issuer = "https://mydomain.com/";
		final String secret = "{{a secret used for signing}}";

		final long iat = System.currentTimeMillis() / 1000l; // issued at claim 
		final long exp = iat + 60L; // expires claim. In this case the token expires in 60 seconds

		final JWTSigner signer = new JWTSigner(secret);
		final HashMap<String, Object> claims = new HashMap<String, Object>();
		claims.put("iss", "123456");
		//claims.put("exp", exp);
		//claims.put("iat", iat);
		
		final String jwt = signer.sign(claims);
		System.out.println(jwt);

	}*/
	
	public static void main(String[] args){
		//final String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0NzMwNzk0NjQsImlzcyI6Imh0dHBzOi8vbXlkb21haW4uY29tLyIsImlhdCI6MTQ3MzA3OTQwNH0.GeScL7LMZTZpR_sOJcaeZGiJ-EqjJxLBIvRM5zcdGY4";
		 String jwt="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMjM0NTYifQ.t0GNedRjnNuYJDXvpM_ql8u99rk5hAVV14vDz9CwnfM";
		final String secret = "{{a secret used for signing}}";
		try {
			JWTVerifier jwtVerifier = new JWTVerifier(Base64.encodeBase64String(secret.getBytes()));
		    final JWTVerifier verifier = new JWTVerifier(secret);
		    System.out.println( verifier.verify(jwt));
		    final Map<String,Object> claims= jwtVerifier.verify(jwt);
		    System.out.println(claims);
		    
		} catch (JWTVerifyException e) {
		    // Invalid Token
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
