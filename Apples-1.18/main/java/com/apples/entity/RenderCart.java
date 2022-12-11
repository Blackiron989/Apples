package com.apples.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderCart<T extends InvisibleCartEntity> extends EntityRenderer<T> {

	public RenderCart(EntityRendererProvider.Context provider) {
		
		super(provider);

	}

	@Override
	public ResourceLocation getTextureLocation(InvisibleCartEntity entity) {
		
		return null;
		
	}

}
