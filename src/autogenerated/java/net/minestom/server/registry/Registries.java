// AUTOGENERATED by net.minestom.codegen.RegistriesGenerator
package net.minestom.server.registry;

import net.kyori.adventure.key.Key;
import net.minestom.server.entity.EntityType;
import net.minestom.server.fluids.Fluid;
import net.minestom.server.item.Enchantment;
import net.minestom.server.item.Material;
import net.minestom.server.particle.Particle;
import net.minestom.server.potion.PotionEffect;
import net.minestom.server.potion.PotionType;
import net.minestom.server.sound.SoundEvent;
import net.minestom.server.stat.StatisticType;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

/**
 * AUTOGENERATED
 */
public final class Registries {

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, Material> materials = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, Enchantment> enchantments = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, EntityType> entityTypes = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, Particle> particles = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, PotionType> potionTypes = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, PotionEffect> potionEffects = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, SoundEvent> soundEvents = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, StatisticType> statisticTypes = new HashMap<>();

    /**
     * Should only be used for internal code, please use the get* methods.
     */
    @Deprecated
    public static final HashMap<NamespaceID, Fluid> fluids = new HashMap<>();

    /**
     * Returns the corresponding Material matching the given id. Returns 'AIR' if none match.
     */
    @NotNull
    public static Material getMaterial(String id) {
        return getMaterial(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding Material matching the given id. Returns 'AIR' if none match.
     */
    @NotNull
    public static Material getMaterial(NamespaceID id) {
        return materials.getOrDefault(id, Material.AIR);
    }

    /**
     * Returns the corresponding Material matching the given key. Returns 'AIR' if none match.
     */
    @NotNull
    public static Material getMaterial(Key key) {
        return getMaterial(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding Enchantment matching the given id. Returns null if none match.
     */
    @Nullable
    public static Enchantment getEnchantment(String id) {
        return getEnchantment(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding Enchantment matching the given id. Returns null if none match.
     */
    @Nullable
    public static Enchantment getEnchantment(NamespaceID id) {
        return enchantments.get(id);
    }

    /**
     * Returns the corresponding Enchantment matching the given key. Returns null if none match.
     */
    @Nullable
    public static Enchantment getEnchantment(Key key) {
        return getEnchantment(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding EntityType matching the given id. Returns null if none match.
     */
    @Nullable
    public static EntityType getEntityType(String id) {
        return getEntityType(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding EntityType matching the given id. Returns null if none match.
     */
    @Nullable
    public static EntityType getEntityType(NamespaceID id) {
        return entityTypes.get(id);
    }

    /**
     * Returns the corresponding EntityType matching the given key. Returns null if none match.
     */
    @Nullable
    public static EntityType getEntityType(Key key) {
        return getEntityType(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding Particle matching the given id. Returns null if none match.
     */
    @Nullable
    public static Particle getParticle(String id) {
        return getParticle(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding Particle matching the given id. Returns null if none match.
     */
    @Nullable
    public static Particle getParticle(NamespaceID id) {
        return particles.get(id);
    }

    /**
     * Returns the corresponding Particle matching the given key. Returns null if none match.
     */
    @Nullable
    public static Particle getParticle(Key key) {
        return getParticle(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding PotionType matching the given id. Returns null if none match.
     */
    @Nullable
    public static PotionType getPotionType(String id) {
        return getPotionType(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding PotionType matching the given id. Returns null if none match.
     */
    @Nullable
    public static PotionType getPotionType(NamespaceID id) {
        return potionTypes.get(id);
    }

    /**
     * Returns the corresponding PotionType matching the given key. Returns null if none match.
     */
    @Nullable
    public static PotionType getPotionType(Key key) {
        return getPotionType(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding PotionEffect matching the given id. Returns null if none match.
     */
    @Nullable
    public static PotionEffect getPotionEffect(String id) {
        return getPotionEffect(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding PotionEffect matching the given id. Returns null if none match.
     */
    @Nullable
    public static PotionEffect getPotionEffect(NamespaceID id) {
        return potionEffects.get(id);
    }

    /**
     * Returns the corresponding PotionEffect matching the given key. Returns null if none match.
     */
    @Nullable
    public static PotionEffect getPotionEffect(Key key) {
        return getPotionEffect(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding SoundEvent matching the given id. Returns null if none match.
     */
    @Nullable
    public static SoundEvent getSoundEvent(String id) {
        return getSoundEvent(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding SoundEvent matching the given id. Returns null if none match.
     */
    @Nullable
    public static SoundEvent getSoundEvent(NamespaceID id) {
        return soundEvents.get(id);
    }

    /**
     * Returns the corresponding SoundEvent matching the given key. Returns null if none match.
     */
    @Nullable
    public static SoundEvent getSoundEvent(Key key) {
        return getSoundEvent(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding StatisticType matching the given id. Returns null if none match.
     */
    @Nullable
    public static StatisticType getStatisticType(String id) {
        return getStatisticType(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding StatisticType matching the given id. Returns null if none match.
     */
    @Nullable
    public static StatisticType getStatisticType(NamespaceID id) {
        return statisticTypes.get(id);
    }

    /**
     * Returns the corresponding StatisticType matching the given key. Returns null if none match.
     */
    @Nullable
    public static StatisticType getStatisticType(Key key) {
        return getStatisticType(NamespaceID.from(key));
    }

    /**
     * Returns the corresponding Fluid matching the given id. Returns 'EMPTY' if none match.
     */
    @NotNull
    public static Fluid getFluid(String id) {
        return getFluid(NamespaceID.from(id));
    }

    /**
     * Returns the corresponding Fluid matching the given id. Returns 'EMPTY' if none match.
     */
    @NotNull
    public static Fluid getFluid(NamespaceID id) {
        return fluids.getOrDefault(id, Fluid.EMPTY);
    }

    /**
     * Returns the corresponding Fluid matching the given key. Returns 'EMPTY' if none match.
     */
    @NotNull
    public static Fluid getFluid(Key key) {
        return getFluid(NamespaceID.from(key));
    }
}
