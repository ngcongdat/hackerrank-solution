DECLARE @a FLOAT;
DECLARE @b FLOAT;
DECLARE @c FLOAT;
DECLARE @d FLOAT;
DECLARE @SquareLat FLOAT;
DECLARE @SquareLong FLOAT;
DECLARE @EuclideanDistance FLOAT;
SELECT
  @a = MIN(LAT_N)
  , @b = MIN(LONG_W)
  , @c = MAX(LAT_N)
  , @d = MAX(LONG_W)
  , @SquareLat = SQUARE(ABS(@a - @c))
  , @SquareLong = SQUARE(ABS(@b - @d))
  , @EuclideanDistance = SQRT(@SquareLat + @SquareLong)
FROM STATION;
SELECT
  CAST(@EuclideanDistance AS DECIMAL(10, 4));
