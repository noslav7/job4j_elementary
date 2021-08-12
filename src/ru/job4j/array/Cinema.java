package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int z = 0; z < places[i].length; z++) {
                if (places[i][z] != null && z + 2 < places[i].length) {
                    z = z + 1;
                    continue;
                } else if (places[i][z] == null && z + 1 < places[i].length && places[i][z + 1] == null
                        && i + 1 < places.length && places[i + 1][z] == null) {
                    Place place  = new Place(i, z);
                    return place;
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
