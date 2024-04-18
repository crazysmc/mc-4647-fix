package io.github.crazysmc.mc4647fix.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.renderer.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FogRenderer.class)
public abstract class FogRendererMixin
{
  @ModifyExpressionValue(method = "setupColor", at = @At(value = "INVOKE", target = "Ljava/lang/Math;min(FF)F"))
  private static float ensureFinite(float original)
  {
    return Float.isInfinite(original) ? Math.nextAfter(original, 0.0) : original;
  }
}
