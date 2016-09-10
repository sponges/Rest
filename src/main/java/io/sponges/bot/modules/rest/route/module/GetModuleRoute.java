package io.sponges.bot.modules.rest.route.module;

import io.sponges.bot.api.module.Module;
import io.sponges.bot.modules.rest.route.generic.GenericModuleRoute;
import org.json.JSONObject;
import spark.Request;
import spark.Response;

public class GetModuleRoute extends GenericModuleRoute {

    public GetModuleRoute() {
        super(Method.GET, "");
    }

    @Override
    protected JSONObject execute(Request request, Response response, JSONObject json, Module module) {
        json.put("version", module.getVersion());
        return json;
    }
}
