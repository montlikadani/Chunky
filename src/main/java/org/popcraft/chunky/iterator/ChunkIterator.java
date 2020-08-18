package org.popcraft.chunky.iterator;

import org.popcraft.chunky.ChunkCoordinate;

import java.util.Iterator;

public interface ChunkIterator extends Iterator<ChunkCoordinate> {
    ChunkCoordinate peek();

    ChunkCoordinate center();

    long total();

    String name();
}
