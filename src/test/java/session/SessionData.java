package session;

import com.google.common.graph.Network;
import net.serenitybdd.core.Serenity;
import savitatest.SingIn.SingInPage;

public enum SessionData {

    INSTANCE;

    /**
     * Singleton
     */

    protected void putIntoSession(String key, Object value) {

        Serenity.setSessionVariable(key).to(value);
    }

    protected Object getFromSession(String key) {

        return Serenity.sessionVariableCalled(key);
    }

    public void setEmail(String email) {
        putIntoSession("email", email);
    }

    public String getEmail() {
        return (String) getFromSession("email");
    }

}
