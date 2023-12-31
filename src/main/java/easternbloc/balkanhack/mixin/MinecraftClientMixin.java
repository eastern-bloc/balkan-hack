package easternbloc.balkanhack.mixin;

import easternbloc.balkanhack.BalkanHack;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(at = @At("HEAD"), method = "tick()V")
    public void tick (CallbackInfo info) {
        BalkanHack.INSTANCE.tick();
    }
}
