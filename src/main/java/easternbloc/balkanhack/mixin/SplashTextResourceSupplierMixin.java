package easternbloc.balkanhack.mixin;

import easternbloc.balkanhack.BalkanHack;
import easternbloc.balkanhack.core.settings.SettingManager;
import net.minecraft.client.gui.screen.SplashTextRenderer;
import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Random;

@Mixin(SplashTextResourceSupplier.class)
public class SplashTextResourceSupplierMixin {
    private boolean override = true;
    private final Random random = new Random();
    private List<String> splashes;

    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    private void onApply(CallbackInfoReturnable<SplashTextRenderer> cir) {
        // yikes but ok
        splashes = (List<String>) BalkanHack.setting_manager.get_setting_in_category(
                "title_screen_splashes",
                SettingManager.SettingCategories.CONFGI
        ).getValue();
        if (override) cir.setReturnValue(new SplashTextRenderer(splashes.get(random.nextInt(splashes.size()))));
        override = !override;
    }

}