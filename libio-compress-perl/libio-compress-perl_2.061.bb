SUMMARY = "IO::Compress::Gzip - Write RFC 1952 files/buffers"
AUTHOR = "Paul Marquees <pmqs@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/IO::Compress::Gzip"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=5bcd3094a287f8ecf5867c934c0a685f"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-${PV}.tar.gz"
SRC_URI[md5sum] = "0dba831e748f03e549eaf288026ef099"
SRC_URI[sha256sum] = "c8fdbc7d8d3601bc4c6d43455d405e0772098ceb1a38fefa72adef5083c6beba"

RPROVIDES_${PN} += "libcompress-zlib-perl \
                    libfile-globmapper-perl \
                    libio-compress-base-perl \
                    libio-compress-bzip2-perl \
                    libio-compress-deflate-perl \
                    libio-compress-gzip-perl \
                    libio-compress-rawdeflate-perl \
                    libio-compress-zip-perl \
                    libio-uncompress-anyinflate-perl \
                    libio-uncompress-anyuncompress-perl \
                    libio-uncompress-base-perl \
                    libio-uncompress-bunzip2-perl \
                    libio-uncompress-gunzip-perl \
                    libio-uncompress-inflate-perl \
                    libio-uncompress-rawinflate-perl \
                    libio-uncompress-unzip-perl \
                    libio-compress-adapter-bzip2-perl \
                    libio-compress-adapter-deflate-perl \
                    libio-compress-adapter-identity-perl \
                    libio-compress-base-common-perl \
                    libio-compress-gzip-constants-perl \
                    libio-compress-zlib-constants-perl \
                    libio-compress-zlib-extra \
                    libio-uncompress-adapter-bunzip2-perl \
                    libio-uncompress-adapter-identity-perl \
                    libio-uncompress-adapter-inflate \
                    "

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
