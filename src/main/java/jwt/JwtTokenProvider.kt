package jwt

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import java.security.Key

class JwtTokenProvider {
    private val SECRET_KEY_STRING = "357638792F423F4428472B4B6250655368566D597133743677397A2443264629"

    fun getAccount(token: String): String {
        return Jwts.parserBuilder().setSigningKey(signKey).build()
            .parseClaimsJws(token).body.subject.toString()
    }
    private val signKey: Key
        get() {
            val keyBytes = Decoders.BASE64.decode(SECRET_KEY_STRING)
            return Keys.hmacShaKeyFor(keyBytes)
        }
}