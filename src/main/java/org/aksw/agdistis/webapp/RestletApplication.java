package org.aksw.agdistis.webapp;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestletApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of GetDisambiguation.
        Router router = new Router(getContext());

        // Defines only one route
        router.attachDefault(GetDisambiguation.class);
        return router;
    }
}
