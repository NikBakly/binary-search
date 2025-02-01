package binarysearch;

import java.util.Comparator;

public class MyArrays {

    private static <T> int genericBinarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {

            int mid = low + ((high - low) >>> 1);
            T midVal = a[mid];

            int cmp = comparator.compare(midVal, key);

            if (cmp < 0) {

                low = mid + 1;
            } else if (cmp > 0) {

                high = mid - 1;
            } else {

                return mid;
            }
        }

        return -(low + 1);
    }

    private static int genericBinarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int genericBinarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int genericBinarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int genericBinarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int genericBinarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // элемент найден
            }
        }
        return -(low + 1); // элемент не найден
    }

    private static int genericBinarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // элемент найден
            }
        }
        return -(low + 1); // элемент не найден
    }

    private static int genericBinarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(byte[] a, byte key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(char[] a, char key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(double[] a, double key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(float[] a, float key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(int[] a, int key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(long[] a, long key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(short[] a, short key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return genericBinarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return genericBinarySearch(a, fromIndex, toIndex, key, c);
    }

}
