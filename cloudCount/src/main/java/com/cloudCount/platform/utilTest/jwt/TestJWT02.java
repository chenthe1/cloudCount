package com.cloudCount.platform.utilTest.jwt;

import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;

public class TestJWT02 {
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		 long time = Long.valueOf("132312124");
	        if(time < System.currentTimeMillis()){
	            System.out.println("false");
	        }
		System.currentTimeMillis();
		// SUBSYSTEM
		
		final String secret = "{{a secret used for signing}}";
		// final String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0NzMxMzE3NzMsImlzcyI6Imh0dHBzOi8vbXlkb21haW4uY29tLyIsImlhdCI6MTQ3MzEzMTcxM30.c4a_0-pS9J0y7MhV0QZUA2nzonDjI6CA3PUFVOO4TeM";
		final String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0NzMxMzM2MjEsImlzcyI6Imh0dHBzOi8vbXlkb21haW4uY29tLyIsImlhdCI6MTQ3MzEzMzU2MX0.unoeTlLEhI-CvK_2sR7xur8bUcd5Np4Byd_OKEkiHyY";
		try {
		    // System.out.println("Adddddddsssssssssssssssssssssssssss:"+jwtVerifier.verify(jwt));
			
		    // 解析 
		    final JWTVerifier verifier = new JWTVerifier(secret);
		    System.out.println( verifier.verify(jwt));
		    final Map<String,Object> claimsMap = verifier.verify(jwt);
		    System.out.println(claimsMap.get("iss"));
		    System.out.println(claimsMap.get("exp"));
		    System.out.println(claimsMap.get("iat"));
		    System.out.println("Bdddddddsssssssssssssssssssssssssss:"+verifier.verify(jwt));
		    
		   /* JWTVerifier jwtVerifier = new JWTVerifier(Base64.encodeBase64String(secret.getBytes()));
		    final Map<String,Object> claims= jwtVerifier.verify(jwt);
		    System.out.println(claims.get("iss"));
		    System.out.println(claims.get("exp"));
		    System.out.println(claims.get("iat"));
		    System.out.println("Bdddddddsssssssssssssssssssssssssss:"+verifier.verify(jwt));
			
			final Map<String,Object> valuesMap= jwtVerifier.verify(jwt);
			System.out.println(valuesMap.get("iss"));
			System.out.println(valuesMap.get("exp"));
			System.out.println(valuesMap.get("iat"));
			System.out.println("Cdddddddsssssssssssssssssssssssssss:" );*/
			
		} catch (Exception e) {
		    // Invalid Token
		}
	}

	
}
