package com.apples.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderLightEmitter<T extends LightEmitterEntity> extends EntityRenderer<LightEmitterEntity> {

	protected RenderLightEmitter(EntityRendererProvider.Context provider) {
		
		super(provider);

	}

	@Override
	public ResourceLocation getTextureLocation(LightEmitterEntity entity) { /*getEntityTexture*/
		return null;
	}

}
