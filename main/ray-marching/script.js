function randomRange(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
let scene;
class Scene {
  constructor() {
    this.ro = createVector(width / 2, height / 2 + height / 4 + height / 8);
    this.objects = [];
    this.screenOffset = this.ro.y - 110;
    const screenY = this.screenOffset;
    this.screen = {
      start: createVector(0, screenY),
      end: createVector(width, screenY),
    };
    this.objects = this.getObjects();
  }

  drawRayOrigin() {
    noStroke();
    fill("white");
    circle(this.ro.x, this.ro.y, 20);
  }

  drawScreen() {
    stroke("white");
    line(
      this.screen.start.x,
      this.screen.start.y,
      this.screen.end.x,
      this.screen.end.y
    );
  }

  getObjects() {
    const objects = [];
    // Place objects at random spots,
    const totalObjectsToPlace =15;
    for (let i = 0; i < totalObjectsToPlace; i++) {
      // create a random vector from x: 0 - width and y: this.screenOffset - 20 - height and radius from 10 - 40
      const randomX = randomRange(0, width);
      const randomY = randomRange(0, this.screenOffset - 60);
      const colors = ["red", "blue", "green"];
      const randomColor = colors[randomRange(0, 2)]; // Random color -> dont get too white colors
      const randomRadius = randomRange(20, 100);
      const objectVector = createVector(randomX, randomY);
      objects.push({
        position: objectVector,
        color: randomColor,
        radius: randomRadius,
      });
    }
    return objects;
  }

  drawObjects() {
    for (let obj of this.objects) {
      fill(obj.color);
      noStroke("white");
      circle(obj.position.x, obj.position.y, obj.radius);
    }
  }

  getDistanceToNearestObject(point) {
    let minDistance = Infinity;
    // For all objects in scene
    for (const object of this.objects) {
      // object is a circle
      // calculate distance of circle from point
      const distance =
        dist(object.position.x, object.position.y, point.x, point.y) -
        object.radius / 2;

      if (distance < minDistance) minDistance = distance;
    }

    return minDistance;
  }

  drawRay() {
    // Formula: r(t) = ro + rd * t
    stroke("white");

    const epsilon = 0.5; // threshold

    // Total distance traveled
    let totalDistanceTraveledByRay = 0;
    let originPoint = this.ro.copy();
    let maxSteps = 100;
    let maxDistance = 1000; // after total distance reaches this, then stop as the scene doesnot go this far

    let finalPoint = this.ro.copy();

    const rayDirection = createVector(
      mouseX - this.ro.x,
      mouseY - this.ro.y
    ).normalize();

    // March the ray
    // rd -> ray direction
    // The direction is from the origin to the mouse position
    // we need to normalize direction (make the vector of unit length)

    let hitPoint;

    for (let i = 0; i < maxSteps; i++) {
      // Find  ro + rd * t
      let currentPoint = p5.Vector.add(
        originPoint,
        p5.Vector.mult(rayDirection, totalDistanceTraveledByRay)
      );

      // Get the distance of point
      const minDistance = this.getDistanceToNearestObject(currentPoint);

      // Draw circle at this point )
      fill("#FFFFFF2A");
      stroke("white");
      circle(currentPoint.x, currentPoint.y, minDistance * 2);

      // if min distance is less than epsilon, break (Early ray termination)
      if (minDistance < epsilon) {
        hitPoint = currentPoint.copy();
        break;
      }
      if (totalDistanceTraveledByRay > maxDistance) break;

      totalDistanceTraveledByRay += minDistance;
      finalPoint = currentPoint.copy();
    }

    if (hitPoint) {
      fill("white");
      circle(hitPoint.x, hitPoint.y, 10);
    }

    stroke(255);
    line(this.ro.x, this.ro.y, finalPoint.x, finalPoint.y);
  }

  render() {
    this.drawObjects();
    this.drawRayOrigin();
    this.drawScreen();
    this.drawRay();
  }
}

function setup() {
  createCanvas(800, 800);
  scene = new Scene();
}

function draw() {
  clear();
  background(20);
  scene.render();
}
