package com.apples.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderCart<T extends EntityCart> extends EntityRenderer<EntityCart> {

	public RenderCart(EntityRendererManager renderManagerIn) {
		
		super(renderManagerIn);

	}

	@Override
	public ResourceLocation getEntityTexture(EntityCart entity) {
		return null;
	}

}
