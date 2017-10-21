<?PHP

function euclidianDistance($p1,$p2)
{
    $dX = $p1->x - $p2->x;
    $dY = $p1->y - $p2->y;

    return sqrt($dX*$dX+$dY*$dY);
};

?>
