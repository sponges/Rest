package io.sponges.bot.modules.rest.route.user;

import io.sponges.bot.api.entities.User;
import io.sponges.bot.modules.rest.route.generic.GenericUserRoute;
import org.json.JSONObject;
import spark.Request;
import spark.Response;

public class GetUserDataRoute extends GenericUserRoute {

    public GetUserDataRoute() {
        super(Method.GET, "/data");
    }

    @Override
    protected JSONObject execute(Request request, Response response, JSONObject json, User user) {
        return new JSONObject(module.getStorage().serialize(user.getData()));
    }
}
