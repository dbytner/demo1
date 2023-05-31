package pl.coderslab.web.cookies;

import javax.servlet.http.Cookie;

public class CookieHelper {

    public static Cookie getCookie(String name, Cookie[] cookies) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) {
                return cookie;
            }
        }
        return null;
    }
}
