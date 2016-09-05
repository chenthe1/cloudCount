package com.cloudCount.platform.amm.web;

import java.util.Map;

import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;

public class TestJWT02 {
	public static void main(String[] args) {
		final String secret = "{{a secret used for signing}}";
		final String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL215ZG9tYWluLmNvbS8iLCJleHAiOjE0NzMwOTEzODcsImlhdCI6MTQ3MzA5MTMyN30.8M1E5ANPiiC-Q3c-b37dtW9we38kddJBC4gWMaBSies";
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
		    
		    JWTVerifier jwtVerifier = new JWTVerifier(Base64.encodeBase64String(secret.getBytes()));
		    final Map<String,Object> claims= jwtVerifier.verify(jwt);
		    System.out.println(claims.get("iss"));
		    System.out.println(claims.get("exp"));
		    System.out.println(claims.get("iat"));
		    System.out.println("Bdddddddsssssssssssssssssssssssssss:"+verifier.verify(jwt));
			
			final Map<String,Object> valuesMap= jwtVerifier.verify(jwt);
			System.out.println(valuesMap.get("iss"));
			System.out.println(valuesMap.get("exp"));
			System.out.println(valuesMap.get("iat"));
			System.out.println("Cdddddddsssssssssssssssssssssssssss:" );
			
		} catch (Exception e) {
		    // Invalid Token
		}
	}

	
}
