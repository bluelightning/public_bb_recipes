SUMMARY = "Encode - character encodings"
DESCRIPTION = "The \"Encode\" module provides the interfaces between Perl's strings and the rest of the system.  Perl strings are \
       sequences of characters. \ 
       See \"perldoc Encode\" for the rest of the story"
AUTHOR = "Dan Kogai <dankogai+cpan@gmail.com>"
HOMEPAGE = "https://metacpan.org/release/Encode"
SECTION = "lib"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=f335275cdfe14e39d59aee6a883b78cd"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-${PV}.tar.gz"
SRC_URI[md5sum] = "bf26ef62725b1938181d71d1127f22d8"
SRC_URI[sha256sum] = "2411a2027195b684065339abb1286dd540ca3ca32d546bd682c4964579ad3c60"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan

RPROVIDES_${PN} += "libencode-alias-perl \
                    libencode-byte-perl \
                    libencode-cjkconstants-perl \
                    libencode-cn-perl \
                    libencode-cn-hz-perl \
                    libencode-config-perl \
                    libencode-ebcdic-perl \
                    libencode-encoder-perl \
                    libencode-encoding-perl \
                    libencode-gsm0338-perl \
                    libencode-guess-perl \
                    libencode-jp-perl \
                    libencode-jp-h2z-perl \
                    libencode-jp-jis7-perl \
                    libencode-kr-perl \
                    libencode-kr-2022_kr-perl \
                    libencode-mime-header-perl \
                    libencode-mime-name-perl \
                    libencode-symbol-perl \
                    libencode-tw-perl \
                    libencode-unicode--perl \
                    libencode-unicode-utf7-perl \
                    libencoding-perl \
                    libencode-internal-perl \
                    libencode-mime-header-iso_2022_jp-perl \
                    libencode-utf8-perl \
                    libencode-utf_ebcdic-perl \
                    "
 
BBCLASSEXTEND = "native"
