package cc.funkemunky.api.commands.impl;

import cc.funkemunky.api.Atlas;
import cc.funkemunky.api.commands.FunkeCommand;
import cc.funkemunky.api.commands.impl.args.ReloadArgument;
import cc.funkemunky.api.commands.impl.args.UpdateArgument;

public class AtlasCommand extends FunkeCommand {
    public AtlasCommand() {
        super(Atlas.getInstance(), "atlas", "Atlas", "The Atlas main command.", "atlas.admin");
    }

    @Override
    protected void addArguments() {
        getArguments().add(new UpdateArgument());
        getArguments().add(new ReloadArgument());
    }
}
