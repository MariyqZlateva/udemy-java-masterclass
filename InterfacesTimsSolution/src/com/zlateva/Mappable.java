package com.zlateva;

enum Geometry {LINE, PONT, POLYGON}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return String.format("""
                        "type": "%s", "label": "%s", "marker": "%s" """,
                getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(String.format(JSON_PROPERTY, mappable.toJSON()));
    }
}
