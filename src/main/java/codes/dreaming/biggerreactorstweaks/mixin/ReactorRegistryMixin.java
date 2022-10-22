package codes.dreaming.biggerreactorstweaks.mixin;

import net.minecraft.block.Block;
import net.roguelogix.biggerreactors.registries.ReactorModeratorRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ReactorModeratorRegistry.class)
public class ReactorRegistryMixin {
    @Inject(at = @At("RETURN"), method = "Lnet/roguelogix/biggerreactors/registries/ReactorModeratorRegistry;isBlockAllowed(Lnet/minecraft/block/Block;)Z", cancellable = true, remap = false)
    private static void onIsBlockAllowed(Block block, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
